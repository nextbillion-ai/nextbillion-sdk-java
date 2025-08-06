import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import org.gradle.plugins.signing.SigningExtension

plugins {
    id("com.vanniktech.maven.publish")
    id("signing")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

// Check for required environment variables
val sonatypeUsername = System.getenv("SONATYPE_USERNAME")
val sonatypePassword = System.getenv("SONATYPE_PASSWORD")
val gpgSigningKey = System.getenv("GPG_SIGNING_KEY")
val gpgSigningPassword = System.getenv("GPG_SIGNING_PASSWORD")

if (sonatypeUsername.isNullOrBlank() || sonatypePassword.isNullOrBlank()) {
    throw GradleException("SONATYPE_USERNAME and SONATYPE_PASSWORD environment variables are required for publishing")
}

if (gpgSigningKey.isNullOrBlank() || gpgSigningPassword.isNullOrBlank()) {
    throw GradleException("GPG_SIGNING_KEY and GPG_SIGNING_PASSWORD environment variables are required for publishing")
}

configure<SigningExtension> {
    useGpgCmd()
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")
    val signingPassword = gpgSigningPassword
    
    if (!signingKeyId.isNullOrBlank() && !signingPassword.isNullOrBlank()) {
        useInMemoryPgpKeys(signingKeyId, gpgSigningKey, signingPassword)
    }
}

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(automaticRelease = true)

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("One Spec Service")
        description.set("An SDK library for nextbillion-sdk")
        url.set("https://docs.nextbillion.ai")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Nextbillion SDK")
                email.set("yun@nextbillion.ai")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/nextbillion-ai/nextbillion-sdk-java.git")
            developerConnection.set("scm:git:git://github.com/nextbillion-ai/nextbillion-sdk-java.git")
            url.set("https://github.com/nextbillion-ai/nextbillion-sdk-java")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}

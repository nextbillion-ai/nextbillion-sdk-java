plugins {
    id("nextbillion-sdk.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":nextbillion-sdk-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :nextbillion-sdk-java-example:run` to run `Main`
    // Use `./gradlew :nextbillion-sdk-java-example:run -Dexample=Something` to run `SomethingExample`
    mainClass = "com.nextbillion_sdk.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}

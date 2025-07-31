plugins {
    id("nextbillion-sdk.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":sdk"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :sdk-example:run` to run `Main`
    // Use `./gradlew :sdk-example:run -Dexample=Something` to run `SomethingExample`
    mainClass = "ai.nextbillion.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}

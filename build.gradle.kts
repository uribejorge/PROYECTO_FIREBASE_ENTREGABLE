// Archivo de configuración de nivel superior donde puedes agregar opciones de configuración comunes para todos los subproyectos/módulos.

plugins {
    alias(libs.plugins.android.application) apply false
}

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")
        classpath("com.google.gms:google-services:4.3.10")
    }
}

allprojects {
    // No agregar repositorios aquí, ya están configurados en settings.gradle.kts
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}

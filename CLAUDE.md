# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project

Single-module Android app (`:app`, package `com.example.claudecode`) built with Kotlin and Jetpack Compose (Material 3). It is currently the stock Android Studio "Empty Activity" template: `MainActivity.kt` plus the theme files under `ui/theme/`, and placeholder example tests.

## Commands

Use the Gradle wrapper (Gradle 8.13, AGP 8.9.3, Kotlin 2.2.21):

- Build debug APK: `./gradlew assembleDebug`
- Unit tests (JVM): `./gradlew test` (or `./gradlew testDebugUnitTest`)
- Single unit test: `./gradlew testDebugUnitTest --tests "com.example.claudecode.ExampleUnitTest"`
- Instrumented tests (needs a device/emulator): `./gradlew connectedDebugAndroidTest`
- Lint: `./gradlew lint`
- Install on connected device: `./gradlew installDebug`

## Notes

- `minSdk` and `targetSdk` are both 36 (`app/build.gradle.kts`), so the app only runs on Android 16+ devices/emulators.
- Dependencies and plugin versions are managed in the version catalog `gradle/libs.versions.toml`; add new ones there and reference them as `libs.*`. Compose versions come from the BOM.
- `settings.gradle.kts` uses `FAIL_ON_PROJECT_REPOS`, so repositories must be declared there, not in module build files.
- Java/Kotlin target is 11 (`compileOptions` / `kotlinOptions`).
- `local.properties` (SDK path) is machine-specific and should not be committed.
- For every website creation use the 'ui-ux-pro-max' skills. 

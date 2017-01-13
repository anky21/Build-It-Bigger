# Gradle for Android and Java Project

In this project, the author creates an app with multiple flavors that uses
multiple libraries and Google Cloud Endpoints. The finished app consists
of four modules: a Java library that provides jokes, a Google Cloud Endpoints
(GCE) project that serves those jokes, an Android Library containing an
activity for displaying jokes, and an Android app that fetches jokes from the
GCE module and passes them to the Android Library for display. It looks something shown in 
the picture below:

![alt text](/assets/app_components.png)

Pre-requisites
--------------

- Android SDK v25
- Android Build Tools v24.0.3
- Android Support Repository v25.1.0

Getting Started
---------------

This project uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

## Why this Project

As Android projects grow in complexity, it becomes necessary to customize the
behavior of the Gradle build tool, allowing automation of repetitive tasks.
Particularly, factoring functionality into libraries and creating product
flavors allow for much bigger projects with minimal added complexity.

Inspiration
----------------
This project is part of Udacity's [Android Developer NanoDegree Program](https://www.udacity.com/course/android-developer-nanodegree-by-google--nd801?v=ad1).
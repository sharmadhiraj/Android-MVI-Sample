# Android MVI Sample Project

This project is a simple Android application that demonstrates the implementation of a counter using
the Model-View-Intent (MVI) architecture pattern.

## Overview

The MVI pattern divides the app into three main components:

- **Model**: Manages data and business logic.
- **View**: Displays data to users and captures user input events.
- **Intent**: Represents user actions within the app.

Data flows unidirectionally from the Model to the View. When a user interacts with the View, it
generates an Intent, processed by the Model to update the app state, reflecting changes in the View.
MVI enhances maintainability, testability, and scalability by separating concerns and enforcing a
clear data flow.

## Features

- Increment and decrement functionality for the counter.
- Implemented using MVI architecture pattern.

## Getting Started

1. Clone the repository.
2. Open the project in Android Studio.
3. Build and run the project on an emulator or physical device.

## Usage

- Press the "Increment" button to increase the counter value.
- Press the "Decrement" button to decrease the counter value.

## Dependencies

- Kotlin
- AndroidX
- Material Design Components
- Jetpack Compose

## Contributions

Contributions are welcome! Feel free to submit issues, feature requests, or pull requests.
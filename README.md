1. Set up the environment
	Install and download Android Studio
	Create a new project by selecting Empty Activity
	Name the project
	Ensure the language utilized is Kotlin
	Click Finish and the project is ready after the process is completed

2. Open AndroidManifest.xml and add "<uses-permission android:name="android.permission.INTERNET" /> before the application tag.
   Otherwise, the program 

3. Add all of the updated dependencies in the build.gradle (Module: app) file.

4. Once all of the necessary dependencies are listed, sync them by clicking on the "Sync Project Gradle Files" icon

5. Create the following Kotlin files in package com.example.fetchitemsapp

   It controls what the user sees and how the app behaves when it starts.
    MainActivity.kt - Class

   This class is responsible for the API call, data filtering, sorting, grouping, and delivering the final data to the MainActivity class.
    ItemViewModel.kt - Class

   The communicator between your app and the remote server
    ApiService.kt - Interface

   Executes API requests
    RetrofitClient.kt - Object
    
   The structure of each item retrieved from the API
    Item.kt - Class

   Controls how the items are displayed on the UI
    ItemAdapter.kt - Class

6. In the "res" folder, create a "layouts" folder (if it's non-existent).

7. Inside the "layouts" folder, create two resource files: activity_main.xml and item_row.xml.
   The activity_main.xml file defines the UI for the MainActivity class.
   The item_row.xml file defines how the individual items in a RecyclerView list are displayed.

8. Run the app to see the list fetched, grouped, sorted, and displayed properly on the emulator or on your physical device.

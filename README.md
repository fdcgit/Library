# Library
Add Using Library

  // Add this in build.gradle of Project Level

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

  // Add this in build.gradle of App Level

	dependencies {
	        implementation 'com.github.fdcgit:Library:1.0'
	}
  
  // Implementation of the Method in MainActivity.java
  
  Map<String, Integer> mapOne, mapTwo;

  mapOne = new HashMap<>();
  mapTwo = new HashMap<>();

  String strResult = String.valueOf(CClass.computeWithRespectToMapObjects(mapOne, "Key1", mapTwo, "Key2", 25, 95));

  Log.d("Result: ", strResult);
  
  
  

Building
========


Following the steps to build the installers:
1. Run Ant target `full-release`, to build ZAP's distribution files;
2. Run Gradle task `buildInstallers`, to build the installers.

Once the build is finished the installers will be located in the directory `build/install4j`.

NOTE: The following properties must be defined (e.g. in file `GRADLE_HOME/gradle.properties` ) to successfully and properly build the installers:
 - `install4jHomeDir` - install4j installation directory;
 - `install4jLicense` - install4j license key.

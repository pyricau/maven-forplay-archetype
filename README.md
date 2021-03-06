# Maven Play'N Archetype

A Maven archetype to quickly get started with Play'N. It generates a new Maven project that uses Play'N and the GWT Maven Plugin, with the needed eclipse conf.

## Steps

### Install Play'N in your local Maven repo

```bash
git clone https://code.google.com/p/playn
cd playn
mvn install
```

### Generate a new Play'N project from the archetype

```bash
mvn archetype:generate \
  -DarchetypeGroupId=info.piwai.forplay \
  -DarchetypeArtifactId=maven-forplay-archetype \
  -DarchetypeVersion=1.0 \
  -DarchetypeRepository=https://github.com/pyricau/maven-forplay-archetype/raw/master/releases \
  -DgroupId=com.mycompany \
  -DartifactId=my-forplay-app \
  -Dmodule=MyAppModule \
  -Dversion=1.0-SNAPSHOT
```

### Check that it builds well with Maven

```bash
mvn package
```

### Import the project into Eclipse

* Install the latest Eclipse with the latest Google plugin and the latest M2Eclipse plugin
* In Eclipse : File > Import > General > Existing Projects into Workspace

### Run Forest, Run!

To run the app with Java, right click on the **com.mycompany.java.MyAppModuleMain** class and hit *Run as > Java Application*

### That's all, folks!

# Maven ForPlay Archetype

A Maven archetype to quickly get started with ForPlay. It generates a new Maven project that uses ForPlay and the GWT Maven Plugin, with the needed eclipse conf.

## Steps

### Install ForPlay in your local Maven repo

```bash
svn checkout http://forplay.googlecode.com/svn/trunk/ forplay
mvn install
```

### Generate a new ForPlay project from the archetype

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
* In Eclipse : File > Import > Existing Projects into Workspace

### That's all, folks!

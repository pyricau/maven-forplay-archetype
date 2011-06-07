A Maven archetype to quickly get started with ForPlay

```bash
# Install ForPlay in your local Maven repo
svn checkout http://forplay.googlecode.com/svn/trunk/ forplay
mvn install

# Generate the a new ForPlay project from the archetype
mvn archetype:generate
  -DarchetypeGroupId=info.piwai.forplay
  -DarchetypeArtifactId=maven-forplay-archetype
  -DarchetypeVersion=1.0-SNAPSHOT
  -DarchetypeRepository=XXX
  -DgroupId=com.mycompany
  -DartifactId=my-forplay-app
  -Dmodule=MyAppModule
  -Dversion=1.0-SNAPSHOT

```
## Grails 7.0.0-SNAPSHOT Bug
This works fine with 7.0.0-M1

```
git clone https://github.com/codeconsole/grails-resource-bug
gradle bootRun
```

```
Failed to load manifest entries from jar file '/Users/user/.gradle/caches/modules-2/files-2.1/org.graalvm.js/js-community/24.1.1/3e874f113d724138c39287df69e5cfb7e5fcf700/js-community-24.1.1.pom': java.util.zip.ZipException: zip END header not found

java.util.zip.ZipException: zip END header not found
	at java.base/java.util.zip.ZipFile$Source.findEND(ZipFile.java:1649)
	at java.base/java.util.zip.ZipFile$Source.initCEN(ZipFile.java:1657)
```


Perhaps broken by https://github.com/grails/grails-core/commit/75f292b0ecabe85d95c0ef2b4b203e208c363220
https://github.com/grails/grails-core/commit/823383708e48c4b3fa87008676b3978a77a9a26c

To see code working with M1, use the working tag
```
git clone https://github.com/codeconsole/grails-resource-bug
git checkout working
gradle bootRun
```

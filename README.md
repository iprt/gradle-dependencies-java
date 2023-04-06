# gradle

declaring dependencies between subprojects

## fix

https://stackoverflow.com/questions/74253917/gradle-core-plugins-plugin-is-not-in-org-gradle-namespace

`buildSrc/build.gradle`

```groovy
plugins {
    id 'groovy-gradle-plugin'
}
```

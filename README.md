# Beholder
[![Build Status](https://travis-ci.com/SimonHarmonicMinor/beholder-core.svg?branch=master)](https://travis-ci.com/SimonHarmonicMinor/beholder-core)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=SimonHarmonicMinor_beholder-core&metric=alert_status)](https://sonarcloud.io/dashboard?id=SimonHarmonicMinor_beholder-core)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=SimonHarmonicMinor_beholder-core&metric=coverage)](https://sonarcloud.io/dashboard?id=SimonHarmonicMinor_beholder-core)
## Automatic Java code style checker
The current version is in alpha stage now. 
The API is not stable and will be probably changed in the future.
If you want `1.0` version to release sooner, feel free to contribute!

The `master` branch represents `DEV-SNAPSHOT` version that updates on each merge of a pull request.
You can find release versions by tag names.

### Table of contents
* [What is it about](#what-is-it-about)
* [Quick start](#quick-start)
* [Usage](#usage)

### What is it about
We always try to specify some code style rules, when it comes to project development in a team.
The problem is that usually these rules are not obligatory. 
For example, we made a deal that all `public` methods should be overridden from an interface or
an abstract class. 
It forces developers to check each pull request for any rule violations. 
Of course, some will be missed. More than that, some will be missed manually.
Imagine that developers decided that test coverage should not be decreased by any new feature implementation.
Do you think it would be possible if there were now automatic analyzers that restrict merges on bad pull requests?
This library provides the same philosophy with code style. 
The build won't be passed, if there is any rule that failed. 

### Quick start
Maven:
```xml
<dependency>
    <groupId>com.github.simonharmonicminor</groupId>
    <artifactId>beholder-core</artifactId>
</dependency>
```

Gradle:
```groovy
dependencies {
    implementation 'com.github.simonharmonicminor:beholder-core' 
}
```

### Usage
// TODO
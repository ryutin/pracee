# Project Pracee

Take a URL and extract the content from it, discarding template, ads,
images, etc.  Distill into metadata.


## Getting Started

These instructions will get you a copy of the project up and running
on your local machine for development and testing purposes. See
deployment for notes on how to deploy the project on a live system.

### Prerequisities

Tika (http://tika.apache.org/) is required.  Apache Tika is a content
analysis toolkit.  I installed this on my Mac using homebrew.

```
-bash brew install tika
```

### Installing

The

```
-bash$ javac -cp /usr/local/Cellar/tika/1.13/libexec/tika-app-1.13.jar:. ContentExtractor.java

-bash$ java -cp /usr/local/Cellar/tika/1.13/libexec/tika-app-1.13.jar:. ContentExtractor http://www.cnn.com/2016/09/24/us/washington-mall-shooting/index.html

```

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* Homebrew

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags).

## Authors

* **H Emery Ford** - *Initial work* - [ryutin](https://github.com/ryutin)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to Apache Tika Project and BoilerPipe
* Inspiration
* etc

run-dist:
	./build/install/app/bin/app

lint:
	./gradlew checkstyleMain

clean:
	./gradlew clean

.PHONY: build
build:
	./gradlew clean build

install:
	./gradlew clean install
# gn_uuid_examples
Examples of UUID v5 generation with globalnames.org namespace

UUID are very popular global unique identifiers. For most practical purposes
they guarantee to be unique and as such allow everybody generate them without
fear of having the same UUID appearing by mistake.

There are several versions of UUID generation, they are all described in
[RFC-4122][1]. UUID version 5 uses SHA-1 hashing algorithm to convert a string
into UUID unambiguously. To prevent UUID clashes v5 uses a namespace as a seed
for the hash generation. As a result every sting can be assigned an identifier
which can be created independently and unambiguously by anybody.

GlobalNames initiative uses UUID version 5 to make it possible to determine
identifiers for name strings via algorithm. Such identifiers can be created
automatically and do not require looking them up or internet connection.

This repository is show examples how to create unambiguous UUID version 5
identifiers using different languages.

Namespace
---------------

To create UUID version five it is necessary to create a namespace UUID. 
in GlobalNames context this id is equal "90181196-fecf-5082-a4c1-411d4f314cda

If algorithm works correctly and a developer uses UUID above -- the
result will always be the same. For example name string "Homo sapiens"
must generate UUID "16f235a0-e4a3-529c-9b83-bd15fe722110"

All examples below should generate identical output:

    Scientific name: Homo sapiens
    GlobalNames UUID: 16f235a0-e4a3-529c-9b83-bd15fe722110

Please note that you might need to install corresponding languages to
be able to run the examples

Go Language example
-------------------

Change to go directory

    cd go

Get uuid package

    go get github.com/satori/go.uuid

Build go executable

    go build gn_uuid.go

Run compiled example

    ./gn_uuid "Homo sapiens"

Java example
------------

To make working Java example go to java direcotry

    cd java

Compile java code

    javac -cp commons-id.jar GlobalNamesUUID.java

Then run example with

   java -cp commons-id.jar:. GlobalNamesUUID "Homo sapiens"

PHP example
-----------

Go to php directory

    cd php

Run example with

    php gn_uuid.php "Homo sapiens"

Python example
--------------

Go to python directory

    cd python

Run example with

    ./gn_uuid.py "Homo sapiens"

Ruby example
------------

Go to ruby directory

    cd ruby

Execute example with

    ./gn_uuid.rb "Homo sapiens"

[1]: http://www.ietf.org/rfc/rfc4122.txt


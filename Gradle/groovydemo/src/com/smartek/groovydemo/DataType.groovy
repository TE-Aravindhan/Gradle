package com.smartek.groovydemo

def a = 20 //Not recommended

println a.class
print a

float b = 10.52F

println b
println b.getClass()

//String

s = 'hello'

println s

name = 'aravind'

s = "hello ${name}"

s = '''
Welcome to gradle
We are going to use groovy in it
'''

println s

emailPattern = /[a-z0-9]+@[a-z]+\.[a-z]{2,3}/

println emailPattern.class

println "testgmail.com"==~ emailPattern
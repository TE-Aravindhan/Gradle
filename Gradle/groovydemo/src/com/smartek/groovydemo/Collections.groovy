package com.smartek.groovydemo

//--------------------------------List---------------------------------------

 l = [1,,2,3,4,5] as LinkedList

println l 
println l.class // Default Array list

l +=[6,7,8]
println l

l << 9
println l

l -=[4,6]
println l

l.each { print it }



l.reverseEach { print it }

//l.permutations{println it}

//-----------------------------------SET-------------------------------
 s = ['java','js','python','js'].toSet()
println s
println s.class

//------------------------------------MAP---------------------------

m = [course:'gradle',rating:4,price:20]
println m

m.each { k,v -> println k
				println v
}

println m.course
println m['course']
println m.get('course')

m.review = 'Awosme'
println m.review

println m

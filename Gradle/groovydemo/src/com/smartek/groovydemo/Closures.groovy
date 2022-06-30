package com.smartek.groovydemo

c = {n=2-> 
	println n%2 ==0 ? "even" : "odd"
	
}
//c = {
//	println it%2 ==0 ? "even" : "odd"
//}

c.call()

//4.times { n-> print n }
4.times { print it }
package com.smartek.groovydemo

//int add(int a, int b) {
//	return a+b
//}

//def add(a,b) {
//	a+b
//}

int add(a=5, b) {
	a+b
}

result = add 4
println result

void display(Map product) {
	println product.name
	println product.price
}

display name:'Realme',price:35000
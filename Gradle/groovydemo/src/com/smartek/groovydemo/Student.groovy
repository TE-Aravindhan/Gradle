package com.smartek.groovydemo

class Students {
	
	def name, id, standard
	static section = 'A'
	void set(id) {
		
		if(id!=null) {
			this.id = id
		}
		
	}
	static void display() {
		println section
	}
}


s = new Students(name:'aravind',id:10, standard:12)

println s.name +" "+ s.id+" "+s.standard
Students.display()
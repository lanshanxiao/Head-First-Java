class Dog {
	String name;
	public static void main(String[] args){
		//����Dog����
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		
		//����Dog����
		Dog[] myDogs = new Dog[3];
		
		//���ŷŹ�
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		//ͨ���������ô�ȡDog
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		//myDog[2]�������ǣ�
		System.out.print("last dog's name is ");
		System.out.println(myDogs[2].name);
		
		//�����Dogִ��bark()
		int x = 0;
		while(x < myDogs.length){
			myDogs[x].bark();
			x = x + 1;
		}
	}
	
	public void bark(){
		System.out.println(name + " says Ruff!");
	}
}
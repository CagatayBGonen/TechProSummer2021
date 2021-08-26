package day32_stringBuilder_accessModifier;

public class C05_AccessModifier02 {

	public static void main(String[] args) {
		
		C04_AccessModifier01 obj1 = new C04_AccessModifier01(); // C04 classindan obj1 create ettik
		
		System.out.println(obj1.defaultAge); // 15
		System.out.println(obj1.protectedAge); // 32
		System.out.println(obj1.publicAge); // 61
		
		C06_AccessModifier03 objName = new C06_AccessModifier03();
		System.out.println(objName.defaultName); // murat bey
		System.out.println(objName.protectedName); // hakan tetik
		System.out.println(objName.publicName); // dayanch bey

	}

}

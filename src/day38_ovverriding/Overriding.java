package day38_ovverriding;

public class Overriding {
	/*
	 * overriding::::
	 * Parent class'taki bir methodu child class'a gore ozellestirerek kullanmaktir.
	 * OVERRIDING KURALLARI
	 * 1) Signature degistirilemez. Overriding create edilirken "method signature" (methodun name + parametresi) 
	 *    kesinlikle ASLAAAA degistirilemez....!!!
	 * 
	 * 2) Overriding create edilirken "Access modifier" belirli kurallara gore degistirilebilir.  
	 * 
	 * 3) Overriding create edilirken "return type" belirli kurallara gore degistirilebilir.
	 * 
	 * 4) overriding create edilirken "method body" %99 degistirilir. ama degistirilmezse CTE vermez (amelelik olur. overriding amaci body create etmek.)
	 * 
	 * 5) overriding create edilirken "parent - child" relation sarttir.
	 * !) inheritance olmadan overriding olmaz. OLAMAZZZ....!
	 * 
	 * 6) "overridden method": parent class'daki method'tur. (ezilen method) 
	 *    "overriding method": child class'daki method'tur. (ezen method)
	 * 7) "overriding method" (child)'in AccMo ya "overriden method" (parent) ile ayni ya da daha genis olmali. 
	 *    Evlat babanin erisimini kısıtlayamaz.
	 * 8) "overriding method" (child)'in return type void ise"overriden method" (parent) in return type void olmali. 
	 *    return typelar ayni olmali.
	 * 9) "overriding method" (child) in return type Wrapper class'dan ise "overriden method"(parent) return type da Wrapper class'tan olmali. kendinden olmayani kabul etmez.
	 *
	 *10) "overriding method" (child) in return type ile "overriden method" (parent) return arasinda is-A (child-->parent relations) iliskisi olmali.
	 *
	 *11) static methodlar overriding edilemezler.
	 *12) private methodlar overriding edilemezler-->cunku private
	 *13) Final methodlar overriding edilemezler--> cunku final. son hali artik degistirilemez.
	 *
	 *14) "polymorphism" (INTERVIEW Q.)--> overloading ve overriding den olusan yapiya denir.
	 *
	 *				"overloading"-->public void yemek(){...}
	 *								public void yemek(String tatli){...}
	 *								public void yemek(String tatli, int ucret){...}
	 *
	 *				"overriding" -->public void icmek(){syso(gazoz)}
	 *                              public void icmek(){syso(dark ve sert kahve)}
	 *                              public void icmek(){syso(ucret)}
	 *               
	 *              "overloading" ile "overriding" arasindaki farklar :
	 *          -----------------------------------------------------------------------
	 *          1) "overloading" de method signature(name+parametre) degistirilir.
	 *             "overriding" de method signature(name+parametre) asla degisitirilmez.
	 *          
	 *          2) "overloading" de inheritance gerekmez.
	 *             "overriding" de inheritance olmadan yapilamaz.
	 *             
	 *          3) "overloading" de body genelikle degistirlmeden kullanilir.
	 *             "overriding" de body hemen hemen her zaman degistirilir.
	 *             
	 *          4) static methodlar overriding edilemezler. ama overloading edilebilirler.
	 *             private methodlar overriding edilemezler. ama overloading edilebilirler.
	 *          
	 *          5) overloading compile time polymorphism dir --> static
	 *             overriding run time polymorphism dir --> dynamic 
	 *	 
	 */
	
}

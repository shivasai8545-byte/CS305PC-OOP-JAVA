class Lab1P1{
	public static void main(String...args){
		byte b = 15;
		Byte bb = b; //Autoboxing
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.SIZE);
		System.out.println(Byte.TYPE);
		System.out.println(bb.BYTES);
		System.out.println(bb.MIN_VALUE);
		System.out.println("------------Integer------");			
		
		int i = 15;
		Integer ii = i; //Autoboxing
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.TYPE);
		System.out.println(ii.BYTES);
		System.out.println(ii.MIN_VALUE);
		System.out.println("---------Short---------");
		
		short s = 12;
	        Short ss = s; //Autoboxing
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.SIZE);
		System.out.println(Short.TYPE);
		System.out.println(ss.BYTES);
		System.out.println(ss.MIN_VALUE);
		System.out.println("------------Long------");
		
		long l = 12;
		Long ll = l; //Autoboxing
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.SIZE);
		System.out.println(Long.TYPE);
		System.out.println(ll.BYTES);
		System.out.println(ll.MIN_VALUE);
		System.out.println("------------Float------");
		
		float f = 12;
		Float ff = f; //Autoboxing
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.SIZE);
		System.out.println(Float.TYPE);
		System.out.println(ff.BYTES);
		System.out.println(ff.MIN_VALUE);
		System.out.println("------------Double------");
		
		double d = 12;
		Double dd = d; //Autoboxing
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.SIZE);
		System.out.println(Double.TYPE);
		System.out.println(dd.BYTES);
		System.out.println(dd.MIN_VALUE);
		System.out.println("-----------Boolean------");
		
		boolean c = true;
		Boolean cc = c; //Autoboxing
		//System.out.println(Boolean.MAX_VALUE);
		//System.out.println(Boolean.SIZE);
		System.out.println(Boolean.TYPE);
		//System.out.println(cc.BYTES);
		//System.out.println(cc.MIN_VALUE);
		System.out.println("------------End------");
	}
}

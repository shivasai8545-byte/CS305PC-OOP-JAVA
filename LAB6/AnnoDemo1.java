class AnnoP{
	@Deprecated
	public  void depM(){
		System.out.println("Depricated method");
	}
	public void ovR(){
		System.out.println("AnnoP");
	}
}
class AnnoC extends AnnoP{
	@Override
	public void ovR(){
		System.out.println("AnnoC");
	}
}
public class AnnoDemo1{
	@SuppressWarnings("deprecation")
	public static void main(String...args){
		class<?> ct = AnnoC.class;
		AnnoC ac=  new AnnoC();
		ac.ovR();
		ac.depM();
		system.out.println(ct.isAnnotationPresent(MyAnno.class));
	}
}

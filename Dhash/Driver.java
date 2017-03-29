import java.util.*;

class Driver{

	public static void main(String [] ar){
		try{
           	Dhash dhash = new Dhash();
            int threshold = 15,bit_distance=0;
            String img1 = dhash.getHash("TestImage/Kola.jpg");
            String img2 = dhash.getHash("TestImage/Kola_sharp.jpg");

            bit_distance = dhash.distance(img1,img2);
            System.out.println("Number of Different bits : "+bit_distance);
            if(bit_distance<threshold)
                System.out.println("Images might be similar with threshold : "+threshold+" bits");
            else
                System.out.println("Images might be different");

        }catch(Exception e){
            System.out.println(e);
            }
	}
};

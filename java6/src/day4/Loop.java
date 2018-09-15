package day4;

public class Loop {

	public static void main(String[] args) {
		String[][] array=new String[][]{{"jee","jerry","danny","kitty"},{"lxm","dan"},{"hayyp","大树","caven"},{"je","kds"}};
		/*for (int i = 0; i < array.length; i++) {
			System.out.println("");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
				
			}
		}*/
		/**
		 * for(接受的类型   变量名:循环的数组名)*/
        for (String[] classNameArray : array) {
        	System.out.println("");
			for (String eachName : classNameArray) {
				System.out.print(eachName);
			}
		}
        
	}

}

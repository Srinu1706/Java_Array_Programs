public class Insert_An_Element {
    public static void main(String[] args) {
        // 0 1 2 3 4
        int value=4;
        int index=3;
        int input []={1, 2, 3, 5};
        int n=input.length+1;
        int [] newArray=new int[n];
        for (int i=0;i<=2;i++){
            newArray[i]=input[i];
        }
        newArray[index]=value;
        for (int i=index;i<= input.length-1;i++){
            newArray[index+1]  =input[i];
        }
        System.out.println("Afte Adding");
        for (int i=0;i<=input.length;i++){
            System.out.print(newArray[i]+" ");
        }
    }
}

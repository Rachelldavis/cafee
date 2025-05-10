public class Main{
    public static void main(String[] args){
        int a[][]= {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16},
                    {17,18,19,20}};
                    
        int rowstart=0,rowend=a.length;
        int colstart=0,colend=a[0].length;
        while(rowstart<rowend && colstart<colend){
            //left to right
            for(int i=colstart;i<colend;i++)
                System.out.print(a[rowstart][i]+ " ");
            rowstart+=1;
            //top to bottom
            for(int i=rowstart;i<rowend;i++)
                System.out.print(a[i][colend-1]+ " ");
            colend -=1;
            //right to left
            for(int i=colend-1;i<colstart;i--)
                System.out.print(a[rowend-1][i]+ " ");
            rowend-=1;
            //bottom to top
            for(int i=rowend;i<rowstart;i--)
                System.out.print(a[i][colstart]+ " ");
            colstart+=1;
            
                
                
                
            
            
        }
                   
    }
}
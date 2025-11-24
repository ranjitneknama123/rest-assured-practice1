package rough;

public class FinDDuplicate {

    public static void main(String[] args) {
        String s = "abac";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int count=1;
            for(int j=i+1;j< args.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]=' ';
                }
            }
            if(count>1 && ch[i]!=' '){
                System.out.println(ch[i]);
            }
        }

    }
}

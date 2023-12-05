package 专业协会会员信息管理系统;



import java.util.ArrayList;
import java.util.Scanner;

public class StandardMember extends Member{
    private final int fee =500;




    public int getFee() {
        return fee;
    }

    public static void addStandardMember(ArrayList<StandardMember> StandardMemberArray) {

        Scanner in = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = in.nextLine();
        System.out.println("请输入地址");
        String address = in.nextLine();


        StandardMember StandardMember = new StandardMember();
        StandardMember.setName(name);
        StandardMember.setAddress(address);


        StandardMemberArray.add(StandardMember);

    }

    public static void deleteStandardMember( ArrayList<StandardMember> StandardMemberArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的姓名");
        String name = sc.nextLine();
        for (int i = 0; i < StandardMemberArray.size(); i++) {
            StandardMember s = StandardMemberArray.get(i);
            if (s.getName().equals(name)) {
                StandardMemberArray.remove(i);
            }
            break;

        }
        System.out.println("删除成功");

    }

    public static void findAllStandardMember(ArrayList<StandardMember> StandardMemberArray) {
        if(StandardMemberArray.size()==0){
            System.out.println("无信息");
        }else{
            System.out.println("姓名\t\t地址\t\t\t会费");
            for (StandardMember k : StandardMemberArray) {
                System.out.println(k.getName() + "\t\t" + k.getAddress() + "\t\t\t" + k.getFee());
            }
        }


    }
}

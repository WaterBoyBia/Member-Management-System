package 专业协会会员信息管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class SeniorMember extends Member {
    private int fee;

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public static void addSeniorMember(ArrayList<SeniorMember> SeniorMemberArray){

        Scanner in = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = in.nextLine();
        System.out.println("请输入地址");
        String address = in.nextLine();
        System.out.println("请输入会费");
        int fee = in.nextInt();


        SeniorMember SeniorMember = new SeniorMember();
        SeniorMember.setName(name);
        SeniorMember.setAddress(address);
        SeniorMember.setFee(fee);


        SeniorMemberArray.add(SeniorMember);

    }

    public static void deleteSeniorMember(ArrayList<SeniorMember> SeniorMemberArray) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的姓名");
        String name = sc.nextLine();
        for (int i = 0; i < SeniorMemberArray.size(); i++) {
            SeniorMember s = SeniorMemberArray.get(i);
            if (s.getName().equals(name)) {
                SeniorMemberArray.remove(i);
            }
            break;

        }
        System.out.println("删除成功");

    }

    public static void findAllSeniorMember(ArrayList<SeniorMember> SeniorMemberArray) {
        if(SeniorMemberArray.size()==0){
            System.out.println("无信息");
        }else{
            System.out.println("姓名\t\t地址\t\t\t会费");
            for (SeniorMember k : SeniorMemberArray) {
                System.out.println(k.getName() + "\t\t" + k.getAddress() + "\t\t\t" + k.getFee());
            }
        }


    }
}

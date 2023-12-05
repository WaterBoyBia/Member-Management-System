package 专业协会会员信息管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagementCttee extends SeniorMember {


    public void addCtteeMember(ArrayList<SeniorMember> ManagementCtteeArray,ArrayList<SeniorMember> SeniorMemberArray){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要高级会员姓名");
        String name = sc.nextLine();
        for (int i = 0; i < SeniorMemberArray.size(); i++) {
            SeniorMember s = SeniorMemberArray.get(i);
            if (s.getName().equals(name)) {
                ManagementCtteeArray.add(s);
            }
            break;

        }
        System.out.println("管理委员会成员添加成功");

    }


    public void removeCtteeMember(ArrayList<SeniorMember> ManagementCtteeArray){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的管理委员会成员姓名");
        String name = sc.nextLine();
        for (int i = 0; i < ManagementCtteeArray.size(); i++) {
            SeniorMember s = ManagementCtteeArray.get(i);
            if (s.getName().equals(name)) {
                ManagementCtteeArray.remove(i);
            }
            break;

        }
        System.out.println("删除成功");

    }

    public static void findAllCtteeMember(ArrayList<SeniorMember> CtteeMemberArray) {

        if(CtteeMemberArray.size()==0){
            System.out.println("无信息");
        }else{
            System.out.println("姓名\t\t地址\t\t\t会费");
            for (SeniorMember k : CtteeMemberArray) {
                System.out.println(k.getName() + "\t\t" + k.getAddress() + "\t\t\t" + k.getFee());
        }

        }

    }
}

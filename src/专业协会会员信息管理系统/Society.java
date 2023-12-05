package 专业协会会员信息管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class Society extends Member {

    public static void main(String[] args) {
        ManagementCttee ManagementCttee = new ManagementCttee();
        SeniorMember SeniorMember = new SeniorMember();
        StandardMember StandardMember = new StandardMember();
        ArrayList<SeniorMember> SeniorMemberArray = new ArrayList<SeniorMember>();
        ArrayList<StandardMember> StandardMemberArray = new ArrayList<StandardMember>();
        ArrayList<SeniorMember> ManagementCtteeArray = new ArrayList<SeniorMember>();

        while (true) {

            System.out.println("欢迎使用");
            System.out.println("1.添加普通会员");
            System.out.println("2.添加高级会员");
            System.out.println("3.删除普通会员");
            System.out.println("4.删除高级会员");
            System.out.println("5.查看普通会员");
            System.out.println("6.查看高级会员");
            System.out.println("7.添加管理委员会成员");
            System.out.println("8.删除管理委员会成员");
            System.out.println("9.查看管理委员会会员");
            System.out.println("10.查看总会费");
            System.out.println("0.退出");
            System.out.println("请输入");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    StandardMember.addStandardMember(StandardMemberArray);


                    break;

                case 2:
                    SeniorMember.addSeniorMember(SeniorMemberArray);
                    break;

                case 3:
                    StandardMember.deleteStandardMember(StandardMemberArray);
                    break;


                case 4:
                    SeniorMember.deleteSeniorMember(SeniorMemberArray);
                    break;

                case 5:
                    StandardMember.findAllStandardMember(StandardMemberArray);
                    break;

                case 6:
                    SeniorMember.findAllSeniorMember(SeniorMemberArray);
                    break;

                case 7:
                    ManagementCttee.addCtteeMember(ManagementCtteeArray, SeniorMemberArray);
                    break;

                case 8:
                    ManagementCttee.removeCtteeMember(ManagementCtteeArray);
                    break;


                case 9:
                    ManagementCttee.findAllCtteeMember(ManagementCtteeArray);
                    break;



                case 10:
                    getFeeTotal(SeniorMemberArray, StandardMemberArray,SeniorMember,StandardMember);
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }



    public static void getFeeTotal(ArrayList<SeniorMember> SeniorMemberArray, ArrayList<StandardMember> StandardMemberArray, SeniorMember SeniorMember, StandardMember StandardMember) {
        int SeniorFee = 0;
        int StandardFee = 0;
        int TotalFee = 0;

        StandardFee = StandardMemberArray.size() * StandardMember.getFee();
        for (int i = 0; i < SeniorMemberArray.size(); i++) {
            SeniorMember k = SeniorMemberArray.get(i);

            SeniorFee += k.getFee();
        }
        TotalFee = StandardFee + SeniorFee;
        System.out.println("总会费是："+TotalFee+"元");
    }
}
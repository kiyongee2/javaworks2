package hiding;
public class WorkerTest {
    public static void main(String[] args) {
        Worker workerJang = new Worker();
        //workerJang.companyID ���� �Ұ�.
        workerJang.setCompanyID(1004);
        workerJang.setName("��׷�");

        System.out.println(workerJang.getCompanyID());
        System.out.println(workerJang.getName());
    }
}
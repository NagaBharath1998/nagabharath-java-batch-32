package assignments02;

public class SalesDepartment extends Department{
    private final int departmentSize;

    public SalesDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }
    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }
}
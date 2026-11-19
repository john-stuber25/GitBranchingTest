//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String fileName = "Test";
    ArrayList<Data> allData = new ArrayList<>();
    ArrayList<Data> allDataCopy = new ArrayList<>();
    for(int i = 0; i < 5; i++){
        allData.add(new data());
    }

    new DataFileWriter(fileName, allData);

    allDataCopy =
}

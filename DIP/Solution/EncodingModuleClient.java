public class EncodingModuleClient {
    public static void main(String[] args) {
        DataStorage fileDataStorage = new FileDataStorage();
        DataStorage networkDataStorage = new NetworkDataStorage();

        EncodingModule encodingModule = new EncodingModule(fileDataStorage, networkDataStorage);
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}



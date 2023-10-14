public interface Resource {
    void markResourceFree();
    void markResourceBusy();
    Resource findFreeResource();
  }
  
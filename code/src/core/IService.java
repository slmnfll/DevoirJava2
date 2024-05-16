package core;
import java.util.List;
public interface IService<toDefine> {
    void save(toDefine object);
    List<toDefine> show();
}

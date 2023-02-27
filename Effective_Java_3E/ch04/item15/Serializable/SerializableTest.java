package ch04.item15.Serializable;

import java.io.Serializable;

class SerializableTest implements Serializable {
    private String className = this.getClass().getSimpleName();
    private String typeName = this.getClass().getTypeName();
}

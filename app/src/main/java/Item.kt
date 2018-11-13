package  com.wpt.yujie

public class Item {
    var itemNum: Int = 0
    var varName: String = "变量名"
    var varValue: Float = 0.0001f

    fun writeItemNum(Num: Int): Unit {
        itemNum = Num
    }

    fun writeVarName(name: String) {
        varName = name
    }

    fun writeVarValue(value: Float) {
        varValue = value
    }

    fun readVarName(num: Int): String? {
        if (num == itemNum) {
            return varName
        }
        return null
    }

    fun readVarValue(num: Int): Float? {
        if (num == itemNum) {
            return varValue
        }
        return null
    }
}
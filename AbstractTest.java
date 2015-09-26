abstract class AbstractIt {
abstract float getFloat();
}

public class AbstractTest extends AbstractIt {
private float f1 = 1.0f;
private float getFloat() { return f1; }
}
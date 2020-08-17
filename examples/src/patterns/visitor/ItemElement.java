package patterns.visitor;

public interface ItemElement {
    void accept(ItemElementVisitor visitor);
}
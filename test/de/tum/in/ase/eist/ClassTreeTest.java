package de.tum.in.ase.eist;

import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.jupiter.api.Assertions.*;

class ClassTreeTest {

    @TestSubject
    ClassTree classTree;

    @Mock
    ClassTreeElement root;

    // TODO: Test whether the calculation of the amount of classes is correct as described in the problem statement
    @Test
    void testClassCount() {
        ClassTree classTree = new ClassTree(root);
        expect(classTree.getRoot()).andReturn(root);
        replay(root);
        assertEquals(classTree.getClassCount(), root.calculateClassCount());
    }

    // TODO: Test whether the calculation of the amount of classes fails if no root is available as described in the
    // problem statement
    @Test
    void testGetClassCountThrowsOnNull() {
        ClassTree classTree = new ClassTree(root);
        expect(classTree.getRoot()).andReturn(null);
        replay(root);
        assertThrows(IllegalStateException.class, () -> classTree.getClassCount());
    }
}

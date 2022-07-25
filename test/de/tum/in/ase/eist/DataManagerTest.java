package de.tum.in.ase.eist;

import org.easymock.EasyMockExtension;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(EasyMockExtension.class)
class DataManagerTest {
    // TODO: Test if the creation of a class tree element works as described in the
    // problem statement
    @TestSubject
    DataManager dataManager;
    @Mock
    DataServer dataServer;
    @Mock
    ClassTree classTree;
    @Mock
    ClassTreeElement root;

    @Test
    void testCreateAtPath() {
        ClassTree classTree = new ClassTree(root);
        expect(classTree.getRoot()).andReturn(root);
        replay(root);
        replay(classTree);
        replay(dataServer);
        assertTrue(dataManager.createAtPath(classTree, root, "path"));
    }


}

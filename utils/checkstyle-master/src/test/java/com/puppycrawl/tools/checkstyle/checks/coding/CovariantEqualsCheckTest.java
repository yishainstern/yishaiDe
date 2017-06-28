////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code for adherence to a set of rules.
// Copyright (C) 2001-2015 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
////////////////////////////////////////////////////////////////////////////////

package com.puppycrawl.tools.checkstyle.checks.coding;

import com.puppycrawl.tools.checkstyle.BaseCheckTestSupport;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;
import org.junit.Test;

import static com.puppycrawl.tools.checkstyle.checks.coding.CovariantEqualsCheck.MSG_KEY;

public class CovariantEqualsCheckTest
    extends BaseCheckTestSupport {
    @Test
    public void testDefault()
        throws Exception {
        final DefaultConfiguration checkConfig =
            createCheckConfig(CovariantEqualsCheck.class);
        final String[] expected = {
            "11:24: " + getCheckMessage(MSG_KEY),
            "30:20: " + getCheckMessage(MSG_KEY),
            "64:20: " + getCheckMessage(MSG_KEY),
            "78:28: " + getCheckMessage(MSG_KEY),
            "134:20: " + getCheckMessage(MSG_KEY),
            "138:9: " + getCheckMessage(MSG_KEY),
        };
        verify(checkConfig, getPath("InputCovariant.java"), expected);
    }
}


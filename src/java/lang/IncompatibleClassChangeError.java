/*
 * Copyright (c) 1994, 2008, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.lang;

/**
 * Thrown when an incompatible class change has occurred to some class
 * definition. The definition of some class, on which the currently
 * executing method depends, has since changed.
 * 当某些类发生改变，与定义的不兼容时，抛出该错误；
 * 某些类中的执行的方法依赖于类型改变之前的
 * @author  unascribed
 * @since   1.0
 */
public
class IncompatibleClassChangeError extends LinkageError {
    private static final long serialVersionUID = -4914975503642802119L;

    /**
     * Constructs an <code>IncompatibleClassChangeError</code> with no
     * detail message.
     * 无详细消息的构造函数
     */
    public IncompatibleClassChangeError () {
        super();
    }

    /**
     * Constructs an <code>IncompatibleClassChangeError</code> with the
     * specified detail message.
     * 带详细信息的构造函数
     * @param   s   the detail message.
     */
    public IncompatibleClassChangeError(String s) {
        super(s);
    }
}

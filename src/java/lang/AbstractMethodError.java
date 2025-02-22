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
 * Thrown when an application tries to call an abstract method.
 * Normally, this error is caught by the compiler; this error can
 * only occur at run time if the definition of some class has
 * incompatibly changed since the currently executing method was last
 * compiled.
 * 方法错误抽象类：当一个应用尝试调用抽象方法时抛出它；通常，该错误由编译器捕获；
 * 如果某个类自上一次编译，发生了不兼容的修改，在运行时就会发生该错误
 *
 * @author  unascribed
 * @since   1.0
 */
public
class AbstractMethodError extends IncompatibleClassChangeError {
    private static final long serialVersionUID = -1654391082989018462L;

    /**
     * Constructs an <code>AbstractMethodError</code> with no detail  message.
     * 没有详细信息的构造函数
     */
    public AbstractMethodError() {
        super();
    }

    /**
     * Constructs an <code>AbstractMethodError</code> with the specified
     * detail message.
     * 可传递详细信息的构造函数
     * @param   s   the detail message.
     */
    public AbstractMethodError(String s) {
        super(s);
    }
}

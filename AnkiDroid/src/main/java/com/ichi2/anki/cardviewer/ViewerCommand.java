/*
 Copyright (c) 2020 David Allison <davidallisongithub@gmail.com>

 This program is free software; you can redistribute it and/or modify it under
 the terms of the GNU General Public License as published by the Free Software
 Foundation; either version 3 of the License, or (at your option) any later
 version.

 This program is distributed in the hope that it will be useful, but WITHOUT ANY
 WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 PARTICULAR PURPOSE. See the GNU General Public License for more details.

 You should have received a copy of the GNU General Public License along with
 this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.ichi2.anki.cardviewer;

/** Abstraction: Discuss moving many of these to 'Reviewer' */
public class ViewerCommand {
    public static final int GESTURE_NOTHING = 0;
    public static final int GESTURE_SHOW_ANSWER = 1;
    public static final int GESTURE_FLIP_OR_ANSWER_EASE1 = 2;
    public static final int GESTURE_FLIP_OR_ANSWER_EASE2 = 3;
    public static final int GESTURE_FLIP_OR_ANSWER_EASE3 = 4;
    public static final int GESTURE_FLIP_OR_ANSWER_EASE4 = 5;
    public static final int GESTURE_FLIP_OR_ANSWER_RECOMMENDED = 6;
    public static final int GESTURE_FLIP_OR_ANSWER_BETTER_THAN_RECOMMENDED = 7;
    public static final int GESTURE_UNDO = 8;
    public static final int GESTURE_EDIT = 9;
    public static final int GESTURE_MARK = 10;
    public static final int GESTURE_LOOKUP = 11;
    public static final int GESTURE_BURY_CARD = 12;
    public static final int GESTURE_SUSPEND_CARD = 13;
    public static final int GESTURE_DELETE = 14;
    public static final int GESTURE_PLAY_MEDIA = 16;
    public static final int GESTURE_EXIT = 17;
    public static final int GESTURE_BURY_NOTE = 18;
    public static final int GESTURE_SUSPEND_NOTE = 19;
}

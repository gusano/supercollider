// copyright 2003 stefan kersten <steve@k-hornz.de>
// 2007-9 marije baalman <nescivi AT gmail DOT com>
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License as
// published by the Free Software Foundation; either version 2 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful, but
// WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301
// USA

+ String{

    openHelpFileEmacs {
        if ( Emacs.initialized) {
            Emacs.evalLispExpression(['sclang-find-help', this].asLispString);
        }
    }

    openHTMLFileEmacs {
        if ( Emacs.initialized) {
        //      this.findHelpFile;
            Emacs.evalLispExpression(['w3m-browse-url', this].asLispString);
        }
    }
}

// EOF

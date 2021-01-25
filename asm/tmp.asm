.model small
.stack 100h
.data
  msg db 'Convert to Hex: $'
.code
    main proc
        mov ax,@data
        mov ds,ax
        
        mov bx,26
        
        mov cx, 4
        mov ah,9
        lea dx, msg
        int 21h 
        
        convert:
            rol bx, 4
            mov dl,bl
            and dl,0FH
            cmp dl, 10
            jl so
            add dl, 'A'
            sub dl, 10
            jmp print
            
            so:
                add dl, '0'
                    
            print:
                mov ah, 2
                int 21h
            loop convert
            
            mov dl, 'H'
            int 21h
            
         mov ah, 4ch
         int 21h
         
         main endp
    end main
            
        